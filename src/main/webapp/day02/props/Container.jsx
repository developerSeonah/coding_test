import React from 'react';
import Component1 from "./Component1";
import Component2 from "./Component2";
import Component3 from "./Component3";

const Container = () => {
    // const name = '박선아';
    // const age = 20;
    // const style = {
    //    color:"red"
    // }

    const users = {
        name: '박선아',
        age : 20,
        address : '서울시 성북구',
        phone : '010-1234-5678'
    }

    return (
        <>
            {/*<Component1 name = {name} age = {age}/>*/}
            {/*<Component2 sytle={style}/>*/}
            <Component3 users={users} />
        </>
  );
};

export default Container;