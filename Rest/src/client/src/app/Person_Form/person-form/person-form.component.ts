import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {Person} from "../../Model/person";
import {PersonService} from "../../Service/person.service";

@Component({
  selector: 'app-person-form',
  templateUrl: './person-form.component.html',
  styleUrls: ['./person-form.component.scss']
})
export class PersonFormComponent implements OnInit {

  person:Person;
  constructor(private personService:PersonService) {this.person=new Person()}

  ngOnInit(): void {
  }

  //Todo
  // Diese Methode wird aufgerufen wenn der "Submit" Button Gedrückt wird.
  // Diese Methode soll dann die person an den Server schicken.
  // Nutze dazu den personService.
  onSubmit(studentForm: NgForm)
  {
    console.log(studentForm.value)
    console.log(studentForm.valid)
    if(studentForm.valid) {
    this.person.adresse.city = studentForm.value.city;
    this.person.adresse.street = studentForm.value.street;
    this.person.lastName = studentForm.value.lastname;
    this.person.firstName = studentForm.value.firstname;
    this.person.yearOfBirth = studentForm.value.year;
    console.log(this.person);
    this.personService.addPerson(this.person).subscribe(data => {console.log(data)});
    }
  }

  private reloadPage()
  {
    window.location.reload();
  }
}
