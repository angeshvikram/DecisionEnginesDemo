import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable} from 'rxjs';
import { of } from 'rxjs/observable/of';
import { map, catchError, tap } from 'rxjs/operators';

const endpoint = 'http://localhost:8080/';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Access-Control-Allow-Origin':'http://localhost:4200',
    'Access-Control-Allow-Credentials':'true'
  })
 };

// @Injectable({
//   providedIn: 'root'
// })
@Injectable()
export class RestService {

  constructor(private http: HttpClient) {}

  private extractData(res: Response) {
    let body = res;
    return body || { };
  }

  getProducts(): Observable<any> {
    console.log("getProducts");
    return this.http.get(endpoint + 'products').pipe(
      tap((product) => console.log(`product list=${product}`)),
      map(this.extractData));
  }

  getProduct(id): Observable<any> {
    return this.http.get(endpoint + 'products/' + id).pipe(
      map(this.extractData));
  }

  addProduct (product): Observable<any> {
    console.log(product);
    return this.http.post<any>(endpoint + 'products', JSON.stringify(product), httpOptions).pipe(
      tap((product) => console.log(`added product w/ id=${product.id}`)),
      catchError(this.handleError<any>('addProduct'))
    );
  }

  updateProduct (id, product): Observable<any> {
    return this.http.put(endpoint + 'products/' + id, JSON.stringify(product), httpOptions).pipe(
      tap(_ => console.log(`updated product id=${id}`)),
      catchError(this.handleError<any>('updateProduct'))
    );
  }

  deleteProduct (id): Observable<any> {
    return this.http.delete<any>(endpoint + 'products/' + id, httpOptions).pipe(
      tap(_ => console.log(`deleted product id=${id}`)),
      catchError(this.handleError<any>('deleteProduct'))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      console.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
