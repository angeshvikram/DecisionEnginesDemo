import { Component } from '@angular/core';
// import {RestService} from './rest-service';
import {EmployeeDetails} from './employee-details'

@Component({
  selector: 'app-root',
  // providers: [RestService],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public employee :EmployeeDetails;
  title = 'app';

  // constructor(private _restService :RestService){
  // }

  // ngOnInit() {
  //   console.log(this._restService.findAll());
  // }

  onClick(){
    console.log(this.employee )
  }
}
