import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero';
import { Heros } from '../mock-list';
@Component({
  selector: 'app-canada',
  templateUrl: './canada.component.html',
  styleUrls: ['./canada.component.css']
})
export class CanadaComponent implements OnInit {

  heros = Heros;
  selectedHero?:Hero;

  constructor() { }

  ngOnInit(): void {
  }

  onSelect(hero: Hero){
    this.selectedHero = hero;

  }
}
