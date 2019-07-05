package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.Product;
import com.vo.User;

@Controller
public class ProductController {

	@Resource(name="pbiz")
	Biz<Integer, Product> biz;
	
	@RequestMapping("/productadd.mc")
	public ModelAndView padd() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","product/add");
		mv.addObject("navi", Navi.productadd);
		mv.setViewName("main");
		return mv;
	}
	
	
	@RequestMapping("/productaddimpl.mc")
	public ModelAndView paddimpl(ModelAndView mv,
			Product product) {
		String imgname = product.getMf().getOriginalFilename();
		product.setImgname(imgname);
		
		try {
			biz.register(product);
			System.out.println(product);
			Util.saveFile(product.getMf());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productlist.mc")
	public ModelAndView ulist() {
		ModelAndView mv = new ModelAndView();
		ArrayList<Product> list = null;
		
		try {
			list = biz.get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("plist", list);		
		mv.addObject("center", "product/list");
		mv.addObject("navi", Navi.productlist);
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productdetail.mc")
	public ModelAndView udetail(ModelAndView mv,int id) {
		Product product = null;
		try {
			product = biz.get(id);
			mv.addObject("productdetail", product);		
			mv.addObject("center", "product/detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productupdate.mc")
	public ModelAndView uudpate(ModelAndView mv,int id) {
		Product product = null;
		
		try {
			product = biz.get(id);
			mv.addObject("productupdate", product);		
			mv.addObject("center", "product/update");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productupdateimpl.mc")
	public String pupimpl(Product product) {
		try {
			biz.modify(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:productlist.mc?id="+product.getId();
	}
	
	@RequestMapping("/productdelete.mc")
	public String udel(ModelAndView mv,int id) {
		
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:productlist.mc";
	}
	
}
