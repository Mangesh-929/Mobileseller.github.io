package com.springbootmvchibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springbootmvchibernate.pojo.Contact;
import com.springbootmvchibernate.repository.ContactRepository;

public class ContactController {
	@Autowired
	   private ContactRepository contactRepository;
	 
	   @GetMapping("/contact")
	   public String showContactForm(Contact contact) {
	      return "contact";
	   }
	 
	   @PostMapping("/contact")
	   public String submitContactForm(@Valid Contact contact, BindingResult result, RedirectAttributes redirectAttributes) {
	      if (result.hasErrors()) {
	         return "contact";
	      }
	      contactRepository.save(contact);
	      redirectAttributes.addFlashAttribute("message", "Thanks for contacting us! We'll get back to you soon.");
	      return "redirect:/contact";
	   }

}
