package web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.model.Staff;


@Controller
@RequestMapping("/staff")
public class StaffController {

	@RequestMapping("/detail")
	public String detail(Model model) {
		Staff staff = Staff.builder()
				.id("user@gmail.com")
				.fullname("nguyễn văn user")
				.level(2)
				.build();
		model.addAttribute("staff", staff);
		return "/demo/staff-detail";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Staff> list = List.of(
			Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(0).build(),
			Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
			Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(2).build(),
			Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(2).build(),
			Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
			Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(0).build()
		);
		model.addAttribute("list", list);
		return "/demo/staff-list";
	}

	@RequestMapping("/status")
	public String status(Model model) {
		List<Staff> list = List.of(
			Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(0).build(),
			Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
			Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(2).build(),
			Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(2).build(),
			Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
			Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(0).build()
		);
		model.addAttribute("list", list);
		return "/demo/list-status";
	}

	@RequestMapping("/controls")
	public String controls(Model model) {
		List<Staff> list = List.of(
			Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(0).build(),
			Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
			Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(2).build(),
			Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(2).build(),
			Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
			Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(0).build()
		);
		model.addAttribute("list", list);
		return "/demo/list-controls";
	}
}
