using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerMovement : MonoBehaviour
{
    public Rigidbody2D rb;
    public Transform footPosition;
    public Animator anim;
    public LayerMask ground;

    public float speed;
    public float jumpSpeed;

    private float direction;
    private bool onGround;
    private bool onWall;
    private bool faceRight = true;
    private int doubleJump;
    private bool died = false;
    

    private void Start()
    {
        
    }

    private void Update()
    {
        onGround = Physics2D.OverlapCircle(footPosition.position, 0.3f, ground);
        anim.SetBool("onGround", onGround);
        anim.SetFloat("speedY", rb.velocity.y);

        direction = Input.GetAxis("Horizontal");
        rb.velocity = new Vector2(direction * speed, rb.velocity.y);
        anim.SetFloat("speedX", Mathf.Abs(direction));
        
        if ((direction < 0 && faceRight) || (direction > 0 && !faceRight))
        {
            faceRight = !faceRight;
            transform.Rotate(0f, 180f, 0f);
        }

        CheckInput();

      
    }

    public void CheckInput()
    {
        if (onGround)
        {
            doubleJump = 2;
        }

        if (Input.GetButtonDown("Jump") && doubleJump > 0)
        {
            Jump();
        }

    }

    public void Jump()
    {
        doubleJump--;
        rb.velocity = Vector2.up * jumpSpeed;
    }

}
