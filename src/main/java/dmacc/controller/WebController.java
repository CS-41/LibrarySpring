/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.LibraryRecord;
import dmacc.repository.RecordRepository;

@Controller
public class WebController {
	@Autowired
	RecordRepository repo;

	@GetMapping({"/", "viewAll"})
	public String viewAllRecords(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewRecord(model);
		}
		model.addAttribute("records", repo.findAll());
		return "results";
	}

	@GetMapping("/inputRecord")
	public String addNewRecord(Model model) {
		LibraryRecord lr = new LibraryRecord();
		model.addAttribute("newRecord", lr);
		return "input";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateRecord(@PathVariable("id") long id, Model model) {
		LibraryRecord lr = repo.findById(id).orElse(null);
		model.addAttribute("newRecord", lr);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseRecord(LibraryRecord lr, Model model) {
		repo.save(lr);
		return viewAllRecords(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteRecord(@PathVariable("id") long id, Model model) {
		LibraryRecord lr = repo.findById(id).orElse(null);
		repo.delete(lr);
		return viewAllRecords(model);
	}
	
}
