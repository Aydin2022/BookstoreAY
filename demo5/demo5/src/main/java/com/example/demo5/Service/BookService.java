package com.example.demo5.Service;

import com.example.demo5.dto.requestDto.BookRequestDto;
import com.example.demo5.dto.responseDto.BookResponseDto;
import com.example.demo5.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    public BookResponseDto addBook(BookRequestDto bookRequestDto);
    public BookResponseDto getBookById(Long bookId);
    public Book getBook(Long bookId);
    public List<BookResponseDto> getBooks();
    public BookResponseDto deleteBook(Long bookId);
    public BookResponseDto editBook(Long bookId, BookRequestDto bookRequestDto);
    public BookResponseDto addAuthorToBook(Long bookId, Long authorId);
    public BookResponseDto deleteAuthorFromBook(Long bookId, Long authorId);
    public BookResponseDto addCategoryToBook(Long bookId, Long categoryId);
    public BookResponseDto removeCategoryFromBook(Long bookId, Long categoryId);
}
