package com.boraji.tutorial.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author imssbora
 */
@Controller
public class MyController {

   /*
    ********Example of using @ModelAttribute on a method*******
    * 
    * The following handler adds a single attribute ( i.e. 'countries') to model
    *  implicitly by returning it
    */
   @ModelAttribute("countries")
   public List<String> populateCountries() {
      List<String> countries= new ArrayList<>();
      countries.add("India");
      countries.add("USA");
      countries.add("Japan");
      return countries;
   }

   /*
    * *******Example of using @ModelAttribute on a method*******
    * 
    * The following handler method accept a model and add multiple attribute to it
    */
   @ModelAttribute
   public void populateCitiesAndLanguages(Model model) {
      
      List<String> cities= new ArrayList<>();
      cities.add("Paris");
      cities.add("New York");
      cities.add("London");
      cities.add("Delhi");
      cities.add("Beijing");
      
      List<String> languages= new ArrayList<>();
      languages.add("English");
      languages.add("Hindi");
      languages.add("Urdu");
      
      
      model.addAttribute("cities", cities);
      model.addAttribute("languages", languages);
   }

   /*
    * *******Example of using @ModelAttribute on a method argument*******
    * 
    * A handler method can have more then one parameters with @ModelAttribute
    * The following handler method will retrieve the 'countries','cities' and 'languages'
    *  attribute from the model
    */
   @RequestMapping("/")
   public String intiView(@ModelAttribute("countries") List<String> countries,
         @ModelAttribute("cities") List<String> cities,
         @ModelAttribute("languages") List<String> languages,
         Model model) {
      
      //Add more countries
      countries.add("Australia");
      countries.add("Canada");
      
      //Add more cities
      cities.add("Cape Town");
      cities.add("Las Vegas");
      
      //Add more languages
      languages.add("Arabic");
      languages.add("Russian");
      
      model.addAttribute("msg", "This an example of using @ModelAttribute.....");
      
      return "main";
   }
}
