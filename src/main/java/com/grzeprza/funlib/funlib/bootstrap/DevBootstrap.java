package com.grzeprza.funlib.funlib.bootstrap;

import com.grzeprza.funlib.funlib.enums.BookCategory;
import com.grzeprza.funlib.funlib.model.Book;
import com.grzeprza.funlib.funlib.service.LibraryService;
import com.grzeprza.funlib.funlib.service.LibraryServiceImpl;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sun.misc.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.LocalDate;
import java.util.Locale;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

   private LibraryService libRepo;

    public DevBootstrap(LibraryService libRepo) {
        this.libRepo = libRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initStaticData();
    }

    private void initStaticData() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("static/bookcover.jpg");

        //
        Book  book = new Book();
        book.setIsbn("1234");
        book.setTitle("Spring Boot - new beginnings");
        book.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vulputate ligula id est tempor ornare. Fusce id quam dictum, euismod urna et, interdum metus. Sed in urna vestibulum, egestas purus id, viverra turpis.");
        book.setAudiobookLanguage(Locale.ENGLISH);
        book.setAudiobookUrl(URI.create("www.linkAudio.com"));
        book.setPdfUrl(URI.create("www.linkPdf.com"));
        book.setCategory(BookCategory.SELFDEV);
        book.setReportsList(null);
        book.setPageCount(999);
        try {
            book.setCover(IOUtils.readFully(is, Integer.MAX_VALUE, false));
        } catch (IOException e) {
            e.printStackTrace();
        }
        book.setLanguage(Locale.ENGLISH);
        book.setOriginalLanguage(Locale.ENGLISH);
        book.setShortDescription("Lorem Ipsum dolor sit amet");
        book.setPublicationYear(LocalDate.now());
        libRepo.addBook(book, "Grze", "Prza", "GPPublishing");

        Book book1 = new Book();
        book1.setIsbn("2345");
        book1.setTitle("Z dupy");
        book1.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vulputate ligula id est tempor ornare. Fusce id quam dictum, euismod urna et, interdum metus. Sed in urna vestibulum, egestas purus id, viverra turpis.");
        book1.setAudiobookLanguage(Locale.ENGLISH);
        book1.setAudiobookUrl(URI.create("www.linkAudio.com"));
        book1.setPdfUrl(URI.create("www.linkPdf.com"));
        book1.setCategory(BookCategory.SELFDEV);
        book1.setReportsList(null);
        book1.setPageCount(999);
        try {
            book1.setCover(IOUtils.readFully(is, Integer.MAX_VALUE, false));
        } catch (IOException e) {
            e.printStackTrace();
        }
        book1.setLanguage(Locale.ENGLISH);
        book1.setOriginalLanguage(Locale.ENGLISH);
        book1.setShortDescription("Lorem Ipsum dolor sit amet");
        book1.setPublicationYear(LocalDate.now());
        libRepo.addBook(book1, "Marcin", "Kras", "MKPublishing");

        Book book2 = new Book();
        book2.setIsbn("3456");
        book2.setTitle("Ekonomia buraka");
        book2.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vulputate ligula id est tempor ornare. Fusce id quam dictum, euismod urna et, interdum metus. Sed in urna vestibulum, egestas purus id, viverra turpis.");
        book2.setAudiobookLanguage(Locale.ENGLISH);
        book2.setAudiobookUrl(URI.create("www.linkAudio.com"));
        book2.setPdfUrl(URI.create("www.linkPdf.com"));
        book2.setCategory(BookCategory.SELFDEV);
        book2.setReportsList(null);
        book2.setPageCount(999);
        try {
            book2.setCover(IOUtils.readFully(is, Integer.MAX_VALUE, false));
        } catch (IOException e) {
            e.printStackTrace();
        }
        book2.setLanguage(Locale.ENGLISH);
        book2.setOriginalLanguage(Locale.ENGLISH);
        book2.setShortDescription("Lorem Ipsum dolor sit amet");
        book2.setPublicationYear(LocalDate.now());
        libRepo.addBook(book2, "Adam","Buracz", "ABPublishing");

        Book  book3 = new Book();
        book3.setIsbn("4567");
        book3.setTitle("Thymeleaf: design uncharted");
        book3.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vulputate ligula id est tempor ornare. Fusce id quam dictum, euismod urna et, interdum metus. Sed in urna vestibulum, egestas purus id, viverra turpis.");
        book3.setAudiobookLanguage(Locale.ENGLISH);
        book3.setAudiobookUrl(URI.create("www.linkAudio.com"));
        book3.setPdfUrl(URI.create("www.linkPdf.com"));
        book3.setCategory(BookCategory.SELFDEV);
        book3.setReportsList(null);
        book3.setPageCount(999);
        try {
            book3.setCover(IOUtils.readFully(is, Integer.MAX_VALUE, false));
        } catch (IOException e) {
            e.printStackTrace();
        }
        book3.setLanguage(Locale.ENGLISH);
        book3.setOriginalLanguage(Locale.ENGLISH);
        book3.setShortDescription("Lorem Ipsum dolor sit amet");
        book3.setPublicationYear(LocalDate.now());
        libRepo.addBook(book3, "Anonim", "Anonimus", "GPPublishing");

        Book book4 = new Book();
        book4.setIsbn("5678");
        book4.setTitle("Z/od bytu");
        book4.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vulputate ligula id est tempor ornare. Fusce id quam dictum, euismod urna et, interdum metus. Sed in urna vestibulum, egestas purus id, viverra turpis.");
        book4.setAudiobookLanguage(Locale.ENGLISH);
        book4.setAudiobookUrl(URI.create("www.linkAudio.com"));
        book4.setPdfUrl(URI.create("www.linkPdf.com"));
        book4.setCategory(BookCategory.SELFDEV);
        book4.setReportsList(null);
        book4.setPageCount(999);
        try {
            book4.setCover(IOUtils.readFully(is, Integer.MAX_VALUE, false));
        } catch (IOException e) {
            e.printStackTrace();
        }
        book4.setLanguage(Locale.ENGLISH);
        book4.setOriginalLanguage(Locale.ENGLISH);
        book4.setShortDescription("Lorem Ipsum dolor sit amet");
        book4.setPublicationYear(LocalDate.now());
        libRepo.addBook(book4, "Marcin","Kras", "ABPublishing");

    }
}
