.class final LU/a;
.super LU/h;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final n:I

.field private final o:I

.field private final p:I

.field private final q:Ljava/lang/String;


# direct methods
.method constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LU/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LU/a;->n:I

    .line 5
    .line 6
    iput p2, p0, LU/a;->o:I

    .line 7
    .line 8
    iput p3, p0, LU/a;->p:I

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    iput-object p4, p0, LU/a;->q:Ljava/lang/String;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 16
    .line 17
    const-string p2, "Null description"

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method


# virtual methods
.method p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LU/a;->q:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    iget v0, p0, LU/a;->n:I

    .line 2
    .line 3
    return v0
.end method

.method r()I
    .locals 1

    .line 1
    iget v0, p0, LU/a;->o:I

    .line 2
    .line 3
    return v0
.end method

.method s()I
    .locals 1

    .line 1
    iget v0, p0, LU/a;->p:I

    .line 2
    .line 3
    return v0
.end method
