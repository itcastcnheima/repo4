package it.heima.Controller;

import it.heima.Services.itemService;
import it.heima.domain.item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
@Transactional
public class itemController  {
    @Autowired
        private itemService service;
    @RequestMapping("/findbyid")
    @Transactional(readOnly = true)
    public String findById(int id, Model model){
        item byId = service.findById(id);
        model.addAttribute("item",byId);
        ///6666666
        return "itemDetail";
    }
}
