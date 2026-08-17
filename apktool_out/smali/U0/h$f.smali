.class LU0/h$f;
.super LU0/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU0/h;-><init>(LU0/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LU0/k;

.field final synthetic c:LU0/h;


# direct methods
.method constructor <init>(LU0/h;Ljava/lang/String;LU0/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU0/h$f;->c:LU0/h;

    .line 2
    .line 3
    iput-object p3, p0, LU0/h$f;->b:LU0/k;

    .line 4
    .line 5
    invoke-direct {p0, p2}, LU0/j;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)F
    .locals 0

    .line 1
    iget-object p1, p0, LU0/h$f;->b:LU0/k;

    .line 2
    .line 3
    invoke-virtual {p1}, LU0/k;->a()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Ljava/lang/Object;F)V
    .locals 0

    .line 1
    iget-object p1, p0, LU0/h$f;->b:LU0/k;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, LU0/k;->b(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
