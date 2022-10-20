import { Component, OnInit } from '@angular/core';
import {Person} from "../../Model/person";
import {PersonService} from "../../Service/person.service";

@Component({
  selector: 'app-person-table',
  templateUrl: './person-table.component.html',
  styleUrls: ['./person-table.component.scss']
})
export class PersonTableComponent implements OnInit
{
  persons: Person[]|undefined;
  searchMin:number=0;
  searchMax:number=0;
  searchCity:String="";

  constructor(private personService:PersonService) {}

  //Todo
  // Diese Methode wird automatisch aufgerufen, wenn die Component geladen wird.
  // Ändere sie so, dass alle Personen aus der Datenbank in die Tabelle geladen werden.
  // Benutze dafür den personService.
  ngOnInit(): void
  {
    this.personService.findAll().subscribe(data => {this.persons = data})
  }

  //Todo
  // Soll alle Personen anzeigen,welche zwischen dem Jahr 'searchMin' und 'searchMax' geboren wurden.
  findPerson(searchMin: number, searchMax: number)
  {
    this.personService.findByAge(searchMin, searchMax).subscribe(data => {this.persons = data})
  }

  //Todo
  // Soll alle Personen anzeigen, welche aus einer Stadt kommen.
  searchByCity(searchCity: String)
  {
    this.personService.findByCity(searchCity).subscribe(data => {this.persons = data})
  }

  reset()
  {
    this.searchCity="";
    this.searchMin=0;
    this.searchMax=0;
    this.ngOnInit()
  }
}
