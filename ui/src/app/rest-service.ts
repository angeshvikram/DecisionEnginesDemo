// import {Http, Response, Headers} from '@angular/http';
// import {Inject, Injectable} from '@angular/core';
// import {Observable} from 'rxjs/Observable';
// import 'rxjs/Rx';
//
// @Injectable()
// export class RestService{
//
//   private let headers;
//   // private headers :string;
//   private options :string;
//   private serverUrl :string = 'http://app:8080/';
//
//   constructor(private _http :Http)  {
//     this.headers = new Headers();
//     this.headers.append('Content-Type', 'application/json');
//     this.headers.append('Accept', 'application/json');
//   }
//
//   findAll(){
//     return this._http.get(this.serverUrl+'student')
//       .map( res => res.json())
//       .catch(this.handleError);
//   }
//  // handleError(error) {
//  //    console.error(error);
//  //    return Observable.throw(error.json().error || 'Server error');
//  //  }
//
// }
