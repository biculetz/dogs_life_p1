import { getNumberOfDogs } from "../services/dog-service";
import { useEffect } from 'react';
import {useState} from 'react';


const NumberOfDogs = () => {


const [num,setNumber] = useState(0);

useEffect(()=>{
    getNumberOfDogsfromAPI();}, 
    []
);
const getNumberOfDogsfromAPI = ()=>{}

getNumberOfDogs()
  .then(res => {
      setNumber(res.data);
  })
  .catch(err => {
      setNumber(0);
      console.log(err);
  })

  return (

    <h1> Total number is: {num} </h1>
  )
}

export default NumberOfDogs