import React from "react";

const Jsx04 = () =>{
    const name = undefined ||'기본값'
    const login = true;
    const guest = true;

    return (
        <div>
            {name}
            {/* {if()} if 문을 사용할 수 없다 */}

            {login && guest && (
                <div>
                    <h1>비회원으로 로그인이 되었습니다. 🥸</h1>
                </div>
            )}

            { login ? (
                <h1>{name}님 환영합니다</h1>
            ):(
                <h2>로그인 실패</h2>
            )}
        </div>
    )
}
export default Jsx04;
