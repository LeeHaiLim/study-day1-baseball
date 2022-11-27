## 기능 목록

### 중복되지 않는 랜덤 숫자 3개를 발급해주는 클래스 ClassName : NumberGenerator
- [x] 범위 내의 중복되지 않는 랜덤 숫자 3개를 반환하는 기능 - #getGameNumbers()
---
### 발급된 3개의 숫자를 저장하는 일급컬렉션 ClassName : GameNumber
- [x] 볼의 개수를 반환하는 기능 - #getBallNumbers()
  - [x] 숫자가 포함되는지 판단하는 기능 - #isBall()
- [x] 스트라이크의 개수를 반환하는 기능 - #getStrikeNumbers()
  - [x] 포함되는 숫자가 자리수까지 일치하는지 판단하는 기능 - #isStrike()
---
### 사용자의 입력을 담당하는 클래스 ClassName : InputView
- [x] 사용자의 숫자를 문자열로 입력받아 List 로 변환하는 기능 - #readUserNumber()
  - 예외처리
    - [x] 입력받은 문자열의 길이가 3이 아닌 경우 예외처리 - #isValidLength()
    - [x] 입력 받은 문자열이 숫자로 변환이 가능하지 않으면 예외처리 - #isNumeral()
- [x] 재게임 관련 입력을 받아 변환 후 반환 기능 - #readReGameInput()
  - [x] 입력 받은 문자열이 숫자로 변환이 가능하지 않으면 예외처리 - #isNumeral()
---
### 재게임 관련 열거형 클래스 ClassName: GameCommand
- 멤버 : RETRY , QUIT
- [x] 입력받은 gameCommand 로 RETRY / QUIT 을 반환 - #getGameCommand()
  - 예외 사항
    - [x] 1혹은 2의 값이 입력되어 값을 찾을 수 없는 경우 
---
### 입력받은 3개의 숫자를 저장하는 일급 컬렉션 ClassName : UserNumber
- [x] 입력받은 숫자 List 를 생성자에서 멤버 변수에 할당
  - 예외처리
    - [x] 중복되는 숫자를 포함하는 경우 예외처리 - #isDuplicate()
    - [x] 숫자가 0을 포함하는 경우 예외처리 - #isContainingZero()
- [x] 사용자의 숫자를 반환하는 기능 - #getUserNumbers()
---
### 출력을 담당하는 클래스 ClassName : OutputView
- [ ] 게임을 시작하는 문구 출력 - #printGameStartMessage()
- [ ] 숫자 입력 요청 문구 철력 - #askNumber()
- [ ] 낫싱을 출력하는 기능 - #printNothing()
- [ ] 게임의 결과를 출력하는 기능 - #printResult()
  - [ ] 스트라이크 개수에 따른 결과를 출력하는 기능 - #saveStrikeResult
  - [ ] 볼의 개수에 따른 결과를 출력하는 기능 - #saveBallResult
- [ ] 게임 종료 시 출력 - #printWinningMessage()
---
### 게임 진행을 담당하는 클래스 ClassName : BaseballGame
- [ ] 숫자를 1번 발급받아 게임을 진행하는 기능 - #doBaseballGame()
---
### 숫자 야구 게임 컨트롤러 ClassName : BaseballGameController
- [ ] 숫자 야구 게임을 실행 - #run()

