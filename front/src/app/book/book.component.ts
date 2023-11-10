import { Component } from '@angular/core';
import { BookService } from '../book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.scss']
})
export class BookComponent {

  books:any;

  constructor(private service:BookService) { }

  ngOnInit() {
    this.books = this.service.getBooks().subscribe(data=>this.books=data);
  }

}
