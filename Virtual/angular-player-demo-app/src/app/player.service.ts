import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core';
import { from, Observable } from 'rxjs';
import { Player } from './player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  private urlCrud: string;
  private urlSearch: string;
  constructor(private http: HttpClient) {
    this.urlCrud = "http://localhost:8000/player/"
    this.urlSearch = "http://localhost:8000/players/"
  }

  public addPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(this.urlCrud, player);
  }

  public getAllPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>(this.urlSearch);
  }

  public updatePlayer(player: Player): Observable<Player> {
    return this.http.put<Player>(this.urlCrud, player);
  }

  public deletePlayer(player: Player): void{
    
    this.http.delete<Player>(this.urlCrud);
  }
}
