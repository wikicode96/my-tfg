package com.wikicode.springboot.app.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.wikicode.springboot.app.models.entity.Menu;
import com.wikicode.springboot.app.models.service.IClienteService;

@AutoConfigureMockMvc(addFilters = false)
@WebMvcTest(ClienteController.class)
class ClienteControllerTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private IClienteService clienteService;

    @Test
    void testList() throws Exception {
    	
    	List<Menu> mockedMenus = new ArrayList<>();
    	mockedMenus.add(new Menu("Pizza", "patatas", "cocacola", 80, "img"));
    	mockedMenus.add(new Menu("Hamburguesa", "patatas", "agua", 70, "img"));
    	
        when(clienteService.findAll()).thenReturn(mockedMenus);

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/menus")).andReturn();

        assertEquals(200, result.getResponse().getStatus());
        assertEquals("menus", result.getModelAndView().getViewName());

        verify(clienteService).findAll();
    }

    @Test
    void testSeleccionarMenu() throws Exception {
    	
        int menuId = 1;
        Menu mockedMenu = new Menu("Pizza", "patatas", "cocacola", 80, "img");
        when(clienteService.findOne(menuId)).thenReturn(mockedMenu);


        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/seleccionar-menu")
                .param("menuID", String.valueOf(menuId)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        assertEquals("pedido", result.getModelAndView().getViewName());
        assertEquals(mockedMenu, result.getModelAndView().getModel().get("menu"));

        verify(clienteService).findOne(menuId);
    }

}
