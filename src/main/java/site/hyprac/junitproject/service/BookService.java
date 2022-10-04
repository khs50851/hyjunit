package site.hyprac.junitproject.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import site.hyprac.junitproject.domain.Book;
import site.hyprac.junitproject.domain.BookRepository;
import site.hyprac.junitproject.web.dto.BookResponseDto;
import site.hyprac.junitproject.web.dto.BookSaveReqDto;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    // 1. 책 등록
    @Transactional(rollbackFor = RuntimeException.class)
    public BookResponseDto 책등록하기(BookSaveReqDto dto){
        
        Book bookPS = bookRepository.save(dto.toEntity());

        return new BookResponseDto().toDto(bookPS);
    }
    // 2. 책 목록보기
    
    // 3. 책한건보기

    // 4. 책삭제

    // 5. 책수정
}
