.class public final LF2/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LH2/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF2/f;-><init>(Ljava/lang/String;LC2/d;LD2/c;LH2/k;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:LF2/f;


# direct methods
.method constructor <init>(LF2/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF2/f$a;->b:LF2/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LF2/f;->h(LF2/f;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, LF2/f$a;->a:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, LF2/f$a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, LF2/f$a;->b:LF2/f;

    .line 2
    .line 3
    invoke-static {v0}, LF2/f;->f(LF2/f;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LF2/f$a;->b:LF2/f;

    .line 2
    .line 3
    invoke-static {v0}, LF2/f;->f(LF2/f;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LF2/f$a;->b:LF2/f;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v0}, LF2/f;->h(LF2/f;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {p1, v1, v2}, LB7/d;->l(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {v0, p1}, LF2/f;->i(LF2/f;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LF2/f$a;->b:LF2/f;

    .line 24
    .line 25
    invoke-static {p1}, LF2/f;->g(LF2/f;)LH2/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, LF2/f$a;->b:LF2/f;

    .line 32
    .line 33
    invoke-static {v0}, LF2/f;->f(LF2/f;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-interface {p1, v0}, LH2/j;->c(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method
