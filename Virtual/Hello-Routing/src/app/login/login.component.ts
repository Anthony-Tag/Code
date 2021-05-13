import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  name:string = "";
  password:string = "";
  phoneNumber:number = 0;

  constructor() { }

  onSubmit(value:any) //We will use this function to event bind the click button that we will create later
  {
    console.log(value);
  }

  ngOnInit(): void {
  }

}
