package fi.viikkokaksi.Viikko2Tehtava3.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fi.viikkokaksi.Viikko2Tehtava3.domain.Friend;

@Controller
public class FriendlistController {

	private ArrayList<Friend> friendList = new ArrayList<>();
	
	@GetMapping("/index")
	public String index(@RequestParam(name="name", required = false, defaultValue = "") String name, Model model) {
		
		if(!name.equals("") && name != null) {
			friendList.add(new Friend(name));
		}
		
		model.addAttribute("friends", friendList);		
		return "index";
	}
}
