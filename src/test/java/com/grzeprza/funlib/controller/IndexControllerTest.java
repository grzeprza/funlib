package com.grzeprza.funlib.controller;

import com.grzeprza.funlib.model.Work;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class IndexControllerTest {

//    @Mock
//    BookService bookService;
//
//    IndexController indexController;
//
//    @Mock
//    private Model model;
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//
//        indexController = new IndexController(bookService);
//    }
//
//    @Test
//    public void getIndexPage() {
//        //given
//        List<Work> works = new LinkedList<>();
//        works.add(new Work());
//        Work work = new Work();
//        work.setId(1L);
//        works.add(work);
//
//        when(bookService.findAllBooks()).thenReturn(works);
//
//        ArgumentCaptor<List<Work>> listArgumentCaptor = ArgumentCaptor.forClass(List.class);
//
//        //when
//        String displayPage = indexController.getIndexPage(model);
//
//        //then
//        assertEquals("index", displayPage);
//        verify(bookService, times(1)).findAllBooks();
//        verify(model, times(1)).addAttribute(eq("allBooks"), listArgumentCaptor.capture());
//        List<Work> booksList = listArgumentCaptor.getValue();
//        assertEquals(2, booksList.size());
//    }
//
//    @Test
//    public void testMockMVC() throws Exception{
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
//
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("index"));
//    }
}