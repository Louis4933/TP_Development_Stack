import { Component, OnInit } from '@angular/core';
import { BookService } from '../services/book.service';
import { ActivatedRoute } from '@angular/router';
import { Book } from '../interfaces/book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.scss']
})
export class BookComponent implements OnInit {
  books: Book[] = [];
  newBook: Book = { id: 0, name: '', price: 0 };

  constructor(private bookService: BookService, private route: ActivatedRoute) {}

  ngOnInit() {
    this.getBooks();
  }

  addBook() {
    if (this.newBook.name && this.newBook.price > 0) {
      this.bookService.addBook(this.newBook).subscribe(() => {
        this.getBooks(); // Refresh the list of books
        this.newBook = { id: 0, name: '', price: 0 }; // Reset the form
      });
    }
  }

  updateBook(id: number) {
    const newName = prompt('Enter new name') || '';
    const newPriceStr = prompt('Enter new price') || '0';
    const newPrice = Number(newPriceStr);
    if (newName || newPrice > 0) {
      const updatedBook = { id: id, name: newName, price: newPrice };
      this.bookService.updateBook(id, updatedBook).subscribe(() => {
        this.getBooks(); // Refresh the list of books
      });
    }
  }

  deleteBook(id: number) {
    this.bookService.deleteBook(id).subscribe(() => {
      this.getBooks();
    });
  }

  private getBooks() {
    this.bookService.getBooks().subscribe(data => {
      this.books = data;
    });
  }
}
