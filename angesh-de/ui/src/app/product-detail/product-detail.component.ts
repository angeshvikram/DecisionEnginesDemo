import { Component, OnInit } from '@angular/core';
import { RestService } from '../rest.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  product:any;

  constructor(public rest:RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {

    if(this.route.snapshot.params['id'] != "undefined"){
      console.log("defined");
      console.log(this.route.snapshot.params['id']);
      this.rest.getProduct(this.route.snapshot.params['id']).subscribe((data: {}) => {
        console.log(data);
        this.product = data;
      });
    }
    else{
      console.log("Not defined");
    }
  }

}
