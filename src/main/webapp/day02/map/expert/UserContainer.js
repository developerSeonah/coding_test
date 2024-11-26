impor React from 'react';
 import users from "./Users";
 import user from "./User";

const UserContainer = () => {
    const users = [
        {
            id:1,
            name:'박선아',
            email: 'salj3895@gmail.com'
        },
        {
            id: 2,
            name: '홍길동',
            email: 'hgd1234@gmail.com'
        },
        {
            id:3,
            name:'신짱구',
            email: 'zzangoo@gmail.com'
        },
        {
            id:4,
            name:'장보고',
            email: 'jbg1234@gmail.com'
        }
    ]

    const userList = <Users user={users}/>
    return (
        <div>
            {userList}
        </div>
    );
};

expor default UserContainer;