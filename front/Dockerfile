# Use an official Node.js runtime as a parent image
FROM node:latest as build

# Set the working directory in the container
WORKDIR /app/front

# Copy package.json and package-lock.json to the container
COPY package*.json ./

# Install Angular CLI
RUN npm install -g @angular/cli

# Install project dependencies
RUN npm install

# Expose port 4200
EXPOSE 4200

# Command to start Nginx when the container starts
CMD ["ng", "serve", "--host", "0.0.0.0"]