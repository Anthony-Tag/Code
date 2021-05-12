import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { PokeService } from '../services/poke.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  currentPokemon:string = "No Pokemon";

  pokeGroup = new FormGroup({
    id: new FormControl(""),
    name: new FormControl("")
  })
  constructor(private router:Router, private pokeServ: PokeService) { }

  swapView(){
    this.router.navigate(["/superhero"])
  }

  pokeGetOne(): void{
    this.pokeServ.retrievePokemon().subscribe(
      (response) => {
        console.log(response)
        this.currentPokemon = response["name"];
      }
    )
  }
  pokeGetTwo(): void{
    this.pokeServ.retrievePokemonTwo().subscribe(
      (response) => {
        console.log(response.name);
        this.currentPokemon = `name: ${response.name} id: ${response.id} base experience ${response.base_experience}`;
      }
    )
  }

  pokeGetThree(pokeGroup: FormGroup): void{
    if (pokeGroup.get("name").value)
    {
      this.pokeServ.retrievepokemonThree(pokeGroup.get("name").value).subscribe(
        (response) => {
          this.currentPokemon = `name: ${response.name} id: ${response.id} base experience ${response.base_experience}`;
        }
      )
    }else if(pokeGroup.get("id").value)
    {
      this.pokeServ.retrievepokemonThree(pokeGroup.get("id").value).subscribe(
        (response) => {
          this.currentPokemon = `name: ${response.name} id: ${response.id} base experience ${response.base_experience}`;
        }
      )
    }
    else
    {
      this.currentPokemon = "Pokemon not found";
    }
  }
  
  ngOnInit(): void {
  }

}
