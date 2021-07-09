import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Hero } from '../hero';
import { HeroService } from '../service/hero.service';
@Component({
  selector: 'app-canada',
  templateUrl: './canada.component.html',
  styleUrls: ['./canada.component.css']
})
export class CanadaComponent implements OnInit {

  heros: Hero[] = [];
  selectedHero?: Hero;

  constructor(private heroService: HeroService) { }

  ngOnInit(): void {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroService.getHeroes().subscribe(heros =>
      this.heros = heros
    )
  }

  onSelect(hero: Hero) {
    this.selectedHero = hero;
  }

}
