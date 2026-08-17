.class final LU8/a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU8/a;->b(LU8/c;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:Ljava/lang/Object;

.field synthetic h:Ljava/lang/Object;

.field final synthetic i:LU8/a;

.field j:I


# direct methods
.method constructor <init>(LU8/a;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU8/a$a;->i:LU8/a;

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
    iput-object p1, p0, LU8/a$a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LU8/a$a;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LU8/a$a;->j:I

    .line 9
    .line 10
    iget-object p1, p0, LU8/a$a;->i:LU8/a;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LU8/a;->b(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
