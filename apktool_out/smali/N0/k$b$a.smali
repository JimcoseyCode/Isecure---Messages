.class final LN0/k$b$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k$b;->b(Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:Ljava/lang/Object;

.field synthetic h:Ljava/lang/Object;

.field final synthetic i:LN0/k$b;

.field j:I


# direct methods
.method constructor <init>(LN0/k$b;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$b$a;->i:LN0/k$b;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ln7/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LN0/k$b$a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LN0/k$b$a;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LN0/k$b$a;->j:I

    .line 9
    .line 10
    iget-object p1, p0, LN0/k$b$a;->i:LN0/k$b;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LN0/k$b;->b(Ln7/f;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
