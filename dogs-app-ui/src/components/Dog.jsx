import React from 'react'

const Dog = (props) => {
  return (
    <p>{props.info.name} is {props.info.age} years old</p>
  )
}

export default Dog