import React from  'react';

const Component3 =  ({users}) => {
    //const {users} = props;

    const {name,age, address, phone} = users;

    return (
        <ul>
            <li>{name}</li>
            <li>{age}</li>
            <li>{address}</li>
            <li>{phone}</li>
        </ul>
    );
};

export default Component3;