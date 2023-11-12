# Use an image with Node.js and npm
FROM node:latest as build

# Set the working directory in the container
WORKDIR /app/front

# Copy the package.json and package-lock.json files
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of your app's source code
COPY . .

# Expose the port on which the Angular application listens
EXPOSE 4200

# Command to run the application
CMD ["npm", "start"]
