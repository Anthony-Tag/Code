import { Component } from "@angular/core";
import { ISuperhero } from "./hero";

@Component({
    /*
        The selector property tells Angular to create and insert an instance of this component to whatever it finds the corresponding tag in template HTML
    */
    selector: 'app-hero-list',
    /*
        It links this TS file with the HTML file in the same folder
        as you know, the HTML will be the visualization of the view that this component controls
    */
    templateUrl: './hero-list.component.html',
    styleUrls: ['./hero-list.component.css']
})
export class HeroListComponent //Export keyword will export this class so it can be imported
{
    title:string = "Super Hero List";
    superheroes: ISuperhero[];
    isVisible:boolean = false;

    constructor()
    {
        this.superheroes = [{ //Hard coded values to add in our ISuperhero array
            name: 'Frozone',
            rank: 4,
            ability: 'cold generation',
            organization: 'incredibles',
            image: 'http://www.cultjer.com/img/ug_photo/2014_03/sf2_lg20140331142439.jpg'
        },
        {
            name: 'Eraser Head',
            rank: 5,
            ability: 'power nullification',
            organization: 'pro hero',
            image: 'https://media.tenor.co/images/788cc935108fb487b6af1e152bcec6bf/raw'
        },
        {
            name: 'Static Shock',
            rank: 4.7,
            ability: 'electric manipulation',
            organization: 'duo',
            image: 'https://t00.deviantart.net/CsfqTmmnwQAltUe4HYS8A7gsk-s=/300x200/filters:fixed_height(100,100)' +
                ':origin()/pre00/64ea/th/pre/f/2012/125/4/1/static_shock_by_deshockwav-d4ynm1o.png'
        },
        {
            name: 'Saitama',
            rank: 2.3,
            ability: 'punches',
            organization: 'the hero association',
            image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnx0maPoLAqImOmsoTnxRwBronngiLYfeOVYFSSs2UBLsjXDDT&s'
        }];
    }

    toggleImage(): void //This will show or hide the images of the HTML
    {
        this.isVisible = !this.isVisible;
    }
}