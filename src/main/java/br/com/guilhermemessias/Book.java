package br.com.guilhermemessias;

import java.time.Instant;
import java.util.UUID;

public class Book {
        private UUID id;
        private String title;
        private Author author;
        private boolean available;
        private Instant createdAt;
        private Instant updatedAt;

        public Book(String title, Author author, boolean available) {
            this.id = java.util.UUID.randomUUID();
            this.title = title;
            this.author = author;
            this.available = available;
            this.createdAt = Instant.now();
            this.updatedAt = Instant.now();
        }

        private void setId(UUID id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public Instant getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Instant createdAt) {
            this.createdAt = createdAt;
        }

        public Instant getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Instant updatedAt) {
            this.updatedAt = updatedAt;
        }

        public UUID getId() {
            return id;
        }
}
