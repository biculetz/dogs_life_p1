import React from 'react'
import HeroDetail from './HeroDetail'
import Row from 'react-bootstrap/Row'
import { useState } from 'react'
import { useEffect } from 'react'
import { getAllHeroes } from '../services/hero-service';

const hero = {
    "id":1,
    "name":"Bruce Wayne",
    "alias":"Batman",
    "superpower":"Martial Arts",
    "teamID":1
}


const AllHeroes = () => {
  const [total, setTotal] = useState(0);
  const [heroes,setHeroes] = useState([]);
  const [img, setImg] = useState('');
  const totalCountHandler = (name) =>{
    console.log(name)
    setTotal(total+1);
}

useEffect(()=>{
  getHeroesFromAPI();}, 
  []
);

const getHeroesFromAPI = ()=>{}
getAllHeroes()
  .then(res => {
      setHeroes(res.data);
  })
  .catch(err => {
      setHeroes([]);
      setImg(hero.alias);
      console.log(err);
  })
return (
  <>
    <h1> Total count is: {total}</h1>
    <Row >
    {heroes.map(hero => (
      <div className='container' key={hero.id.toString()}>
        <HeroDetail info={hero} imag={img} parentCount={totalCountHandler}/>
      </div>
     ))}
    </Row>
  </>
)
}



export default AllHeroes