.class public abstract Lm8/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm8/a$a;
    }
.end annotation


# instance fields
.field protected g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lm8/a;->g:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method d()Lm8/v;
    .locals 1

    .line 1
    new-instance v0, Lm8/v;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lm8/v;-><init>(Lm8/p;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public h(Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lm8/p;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lm8/f;->u(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-static {v1}, Lm8/f;->t(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1, v1}, Lm8/f;->I(Ljava/io/OutputStream;I)Lm8/f;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v0}, Lm8/f;->n0(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, p1}, Lm8/p;->g(Lm8/f;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lm8/f;->H()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
