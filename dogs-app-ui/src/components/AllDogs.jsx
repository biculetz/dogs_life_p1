import React, { useState } from 'react'
import { useEffect } from 'react';
import { getAllDogs } from '../services/dog-service';
import { all } from 'axios';
import Dog from './Dog';

const AllDogs = () => {
    const [allDogs, setAllDogs] = useState([]);
    

    useEffect(() => {
        getDogsFromAPI();
    },
        []
    );
    const getDogsFromAPI = () => {
        getAllDogs().then(res => {
            setAllDogs(res.data)
        })
    }



    return (
        <>
            <h1>AllDogs</h1>
            <p>Here are all the dogs</p> 
            {allDogs.map(dog => (
                <Dog info={dog} />
            ))}


        </>
    )
}

export default AllDogs