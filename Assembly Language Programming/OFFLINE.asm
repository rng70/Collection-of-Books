JUMPS
.MODEL	SMALL

draw_row Macro x
	Local l1
; draws a line in row x from col 10 to col 300
	MOV AH, 0CH
	MOV AL, 2
	MOV CX, 10
	MOV DX, x
L1:	INT 10h
	INC CX
	CMP CX, 310
	JLE L1
EndM


draw_col Macro y
	Local l2
; draws a line col y from row 10 to row 189
	MOV AH, 0CH
	MOV AL, 2
	MOV CX, y
	MOV DX, 10
L2:	INT 10h
	INC DX
	CMP DX, 190
	JL L2
EndM 



.Stack 100h
.Data
new_timer_vec	dw	?,?
old_timer_vec 	dw	?,?
NEW_KEY_VEC	DW	?,?
OLD_KEY_VEC	DW	?,?
SCAN_CODE	DB	0
KEY_FLAG	DB	0
timer_flag 	db	0
PIN_TOP	    DW	45
PIN_BOTTOM	DW	54
PIN_LEFT    DW  12
PIN_RIGHT   DW  12


BALLON_TOP	    DW	0
BALLON_BOTTOM	DW	0
BALLON_LEFT     DW  0
BALLON_RIGHT    DW  0


;vel_x 		dw 	2
vel_y 		dw 	4


;scan codes
UP_ARROW = 72
DOWN_ARROW = 80
LEFT_ARROW = 75
RIGHT_ARROW = 77
ESC_KEY = 1
;


.CODE
  
  
  
timer_tick Proc
	PUSH DS
	PUSH AX
	
	MOV AX, Seg timer_flag
	MOV DS, AX
	MOV timer_flag, 1
	
	POP AX
	POP DS
	
	IRET
timer_tick EndP
 
 
 
 
;sound generating procedure
BEEP	PROC
;generate beeping sound
	PUSH	CX		;save CX
;initialize timer
	MOV	AL,0B6H		;specify mode of operation
	OUT	43H,AL		;write to port 43h
;load count
	MOV	AX,1193		;count for 1000 Hz
	OUT	42H,AL		;low byte
	MOV	AL,AH		;high byte
	OUT	42H,AL
;activate speaker
	IN	AL,61H		;read control port
	MOV	AH,AL		;save value in AH
	OR	AL,11B		;set control bits
	OUT	61H,AL		;activate speaker
;500 ms delay loop
	MOV	CX,9		;do 9 times
B_1:	CMP	TIMER_FLAG,1	;check timer flag
	JNE	B_1		;not set, loop back
	MOV	TIMER_FLAG,0	;flag set, clear it
	LOOP	B_1		;repeat for next tick
;turn off tone
	MOV	AL,AH		;return old control value to AL
	OUT	61H,AL		;restore control value
;
	POP	CX		;restore CX
	RET
BEEP	ENDP




set_display_mode Proc
; sets display mode and draws boundary
	MOV AH, 0
	MOV AL, 04h; 320x200 4 color
	INT 10h
; select palette	
	MOV AH, 0BH
	MOV BH, 1
	MOV BL, 0
	INT 10h
; set bgd color
	MOV BH, 0
	MOV BL, 2; cyan
	INT 10h
	
	MOV AH,2
	MOV BH,0
	MOV DH,0
	MOV DL,38
	INT 10H


	MOV AH, 9
	MOV AL,'2'
	MOV BL,2
	MOV CX,1
	INT 10H
 
          
    MOV AH,2
	DEC DL
	INT 10H
	     
    MOV AH, 9
	MOV AL,'8'
	INT 10H

    MOV AH,2
	DEC DL
	INT 10H
	     
    MOV AH, 9
	MOV AL,'0'
	INT 10H

    MOV AH,2
	DEC DL
	INT 10H
	     
    MOV AH, 9
	MOV AL,'5'
	INT 10H

    MOV AH,2
	DEC DL
	INT 10H
	     
    MOV AH, 9
	MOV AL,'0'
	INT 10H

    MOV AH,2
	DEC DL
	INT 10H
	     
    MOV AH, 9
	MOV AL,'2'
	INT 10H

    MOV AH,2
	DEC DL
	INT 10H
	     
    MOV AH, 9
	MOV AL,'1'
	INT 10H


; draw boundary
	draw_row 10
	draw_row 190
	draw_col 10
	draw_col 310
	
	RET
set_display_mode EndP


display_ballon Proc

	MOV AH, 0CH	; write pixel
	
	MOV BALLON_LEFT, CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	INT 10h
	INC CX
	MOV BALLON_RIGHT, CX
	
	
			; pixel on next col
	MOV BALLON_TOP, DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	INT 10h
	INC DX
	MOV BALLON_BOTTOM, DX
	
	
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	INT 10h
	DEC CX
	
	
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	INT 10h
	DEC DX
	
	
	RET 
display_ballon EndP



	

move_ballon Proc

	MOV AL, 0
	CALL display_ballon
; get new position
	;ADD CX, vel_x
	SUB DX, vel_y
; check boundary
	CALL check_boundary

test_timer_1:
	CMP timer_flag, 1
	JNE test_timer_1
	MOV timer_flag, 0
	MOV AL, 3
	CALL display_ballon
	RET	
move_ballon EndP
;
check_boundary Proc

	CMP CX, 11
	JG LP1
	MOV CX, 11
;	NEG vel_x
	
	JMP LP2 

LP1:	
    CMP CX, 298
	JL LP2
	MOV CX, 298
	;NEG vel_x
	
	
; check row value
LP2:
	CMP DX, 11
	JG LP3
	MOV DX, 157
	 
	CMP CX,250
	JGE LP3
	
	ADD CX,30
	;NEG vel_y
	
	JMP done

LP3:	
    CMP DX, 157
	JL done
	MOV DX, 157
	MOV CX, 30
	NEG vel_y
	
	
done:
	RET 

check_boundary EndP

  
  
  
KEYBOARD_INT	PROC
;keyboard interrupt routine
;save registers
	PUSH	DS
	PUSH	AX
;set up DS
	MOV	AX,SEG SCAN_CODE
	MOV	DS,AX
;input scan code
	IN	AL,60H		;read scan code
	PUSH	AX		;save it
	IN	AL,61H		;control port
	MOV	AH,AL		;save in AH
	OR	AL,80H		;set bit for keyboard
	OUT	61H,AL		;write back
	XCHG	AH,AL		;get back control value
	OUT	61H,AL		;reset control port
	POP	AX		;recover scan code
	MOV	AH,AL		;save scan code in AH
	TEST	AL,80H		;test for break code
	JNE	KEY_0		;yes, clear flags, goto KEY_0
;make code
	MOV	SCAN_CODE,AL	;save in variable
	MOV	KEY_FLAG,1	;set key flag
KEY_0:	MOV	AL,20H		;reset interrupt
	OUT	20H,AL
;restore registers
	POP	AX
	POP	DS
	IRET
KEYBOARD_INT	ENDP		;end KEYBOARD routine
    
    
    

DRAW_PIN	PROC

	PUSH	CX
	PUSH	DX

	MOV	AH,0CH		;write pixel function
	MOV	CX,PIN_LEFT		;column 11
	MOV	DX,PIN_TOP	;top row
DP1:	
    INT	10H
	INC	DX		;next row
	CMP	DX,PIN_BOTTOM ;done?
	JLE	DP1		;no, repeat

	POP	DX
	POP	CX
	RET
DRAW_PIN	ENDP
    
    
    

MOVE_PIN	PROC
	MOV	BX,AX		;copy to BX

	CMP	AX,-2	
	JE	UP		    
	CMP	AX,3	
	JE	DOWN		
	CMP	AX,-4	
	JE	LEFT		
	CMP	AX,4	
	JE	RIGHT		
	
	
			

UP:	
    CMP	PIN_TOP,12	;at top?
	JLE	DONE1		;yes, cannot move
    JMP	UPDATE
    
DOWN:	
    CMP	PIN_BOTTOM,188	;at bottom?
	JGE	DONE1		;yes, cannot move
	JMP	UPDATE

LEFT:	
    CMP	PIN_LEFT,12	
	JLE	DONE1		;yes, cannot move
	JMP	UPDATE

RIGHT:	
    CMP	PIN_LEFT,306	
	JGE	DONE1		;yes, cannot move



UPDATE:	

	MOV	AL,0		;green color
	CALL	DRAW_PIN

	CMP BX,-2
	JE UD
	CMP BX,3
	JE UD
	CMP BX,-4
	JE LR
	CMP BX,4
	JE LR
	
	
UD:	
	ADD	PIN_TOP,BX
	ADD	PIN_BOTTOM,BX
	JMP OK
	
LR:	 
	ADD	PIN_LEFT,BX
	ADD	PIN_RIGHT,BX
	 
OK:
	MOV	AL,2		;red
	CALL	DRAW_PIN

DONE1:	
    
    RET
    
MOVE_PIN	ENDP
  
 
 
  
  
setup_int Proc
; save old vector and set up new vector
; input: al = interrupt number
;	 di = address of buffer for old vector
;	 si = address of buffer containing new vector
; save old interrupt vector
	MOV AH, 35h	; get vector
	INT 21h
	MOV [DI], BX	; save offset
	MOV [DI+2], ES  ; save segment
; setup new vector
	MOV DX, [SI]	; dx has offset
	PUSH DS		; save ds
	MOV DS, [SI+2]	; ds has the segment number
	MOV AH, 25h	; set vector
	INT 21h
	POP DS
	RET
setup_int EndP

  

MAIN PROC
	MOV AX, @data
	MOV DS, AX
	
; set graphics display mode & draw border
	CALL set_display_mode
	
	
	MOV	AL,2		
	CALL	DRAW_PIN 
	
; set up timer interrupt vector
	MOV new_timer_vec, offset timer_tick
	MOV new_timer_vec+2, CS
	MOV AL, 1CH; interrupt type
	LEA DI, old_timer_vec
	LEA SI, new_timer_vec
	CALL setup_int

;set up keyboard interrupt vector
	MOV	NEW_KEY_VEC,OFFSET KEYBOARD_INT	;offset
	MOV	NEW_KEY_VEC+2,CS		;segment
	MOV	AL,9H		;interrupt number
	LEA	DI,OLD_KEY_VEC
	LEA	SI,NEW_KEY_VEC
	CALL	SETUP_INT

RESTART:
	MOV CX, 100
	MOV DX, 157
	MOV AL, 3
	
	MOV BALLON_TOP, DX
	MOV BALLON_BOTTOM ,DX
	ADD BALLON_BOTTOM, 20H
	
	MOV BALLON_LEFT, CX
	MOV BALLON_RIGHT, CX
	ADD BALLON_RIGHT, 20H
	
	CALL display_ballon


;check key flag

TEST_KEY:
    
    CMP	KEY_FLAG,1	        ;check key flag
	JNE	TEST_TIMER	        ;not set, go check timer flag
	MOV	KEY_FLAG,0	        ;flag set, clear it and check
	CMP	SCAN_CODE,ESC_KEY	;Esc key?
	JNE	TK_1		        ;no, check arrow keys
	JMP	DONE2		        ;Esc, terminate

TK_1:	
    CMP	SCAN_CODE,UP_ARROW	;up arrow?
	JNE	TK_2		        ;no, check down arrow
	MOV	AX,-2		        ;yes, move up 2 pixels
	CALL	MOVE_PIN	
	JMP	TEST_TIMER      	;go check timer flag

TK_2:	
    CMP	SCAN_CODE,DOWN_ARROW	;up arrow?
	JNE	TK_3		        ;no, check down arrow
	MOV	AX,3		        ;yes, move up 2 pixels
	CALL	MOVE_PIN	
	JMP	TEST_TIMER      	;go check timer flag

TK_3:	
    CMP	SCAN_CODE,LEFT_ARROW	;up arrow?
	JNE	TK_4		        ;no, check down arrow
	MOV	AX,-4		        ;yes, move up 2 pixels
	CALL	MOVE_PIN	
	JMP	TEST_TIMER      	;go check timer flag


TK_4:	
    CMP	SCAN_CODE,RIGHT_ARROW	;down arrow?
	JNE	TEST_TIMER	        ;no, check timer flag
	MOV	AX,4		        ;yes, move down 2 pixels
	CALL	MOVE_PIN	;





TEST_TIMER:
	CMP	TIMER_FLAG,1	;flag set?
	JNE	TEST_KEY	    ;no, check key flag
	MOV	TIMER_FLAG,0	;yes, clear it
	CALL MOVE_BALLON	;move ball to new position
	
	MOV BX, BALLON_LEFT
	CMP	BX, PIN_LEFT		
	JG TEST_KEY
	MOV BX, BALLON_RIGHT
	CMP	BX, PIN_RIGHT	
	JL TEST_KEY
	
	
	MOV BX, BALLON_BOTTOM
	CMP	BX, PIN_TOP	
	JL	TEST_KEY
	MOV BX, BALLON_TOP
	CMP	BX, PIN_BOTTOM	
	JG	TEST_KEY
	JMP CP_1		


DELAY:
	CMP	TIMER_FLAG,1	;timer ticked?
	JNE	DELAY		    ;no, keep checking
	MOV	TIMER_FLAG,0	;yes, reset flag
	CALL MOVE_BALLON
	
	MOV	AL,2		    ;display red paddle
	CALL DRAW_PIN
	
	JMP	TEST_KEY	    ;check key flag


CP_1:
	MOV	AL,0		;erase ball
	CALL BEEP
	CALL DISPLAY_BALLON


    JMP RESTART

DONE2:
	LEA	DI,NEW_TIMER_VEC
	LEA	SI,OLD_TIMER_VEC
	MOV	AL,1CH
	CALL SETUP_INT

	LEA	DI,NEW_KEY_VEC
	LEA	SI,OLD_KEY_VEC
	MOV	AL,9H
	CALL SETUP_INT


	MOV	AH,0
	INT	16H

	MOV	AH,0
	MOV	AL,3
	INT	10H

	MOV	AH,4CH
	INT	21H
MAIN	ENDP
	END	MAIN
