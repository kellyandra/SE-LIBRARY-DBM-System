<?php
class DBconnection{
protected $connection;

function setconnection(){
    try{
        $this->connection=new PDO("mysql:host=localhost; dbname=mdk","root","");
    
    }catch(PDOException $e){
        echo "Error ! Can't load Site";
     

    }
}

}