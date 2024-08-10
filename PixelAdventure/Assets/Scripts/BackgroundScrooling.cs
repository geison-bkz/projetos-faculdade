using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class BackgroundScrooling : MonoBehaviour
{

    Material material;

    Vector2 offset;

    public float xVolocity, yVelocity;

    private void Awake()
    {
        material = GetComponent<Renderer>().material;
    }

    private void Start()
    {
        offset = new Vector2(xVolocity, yVelocity);
    }

    private void Update()
    {
        material.mainTextureOffset += offset * Time.deltaTime;
    }

}
