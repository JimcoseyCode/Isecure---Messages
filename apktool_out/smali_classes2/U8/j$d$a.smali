.class public final LU8/j$d$a;
.super Lkotlin/coroutines/jvm/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU8/j$d;->l(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field g:Ljava/lang/Object;

.field synthetic h:Ljava/lang/Object;

.field i:I

.field final synthetic j:LU8/j$d;

.field k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LU8/j$d;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU8/j$d$a;->j:LU8/j$d;

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
    iput-object p1, p0, LU8/j$d$a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LU8/j$d$a;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LU8/j$d$a;->i:I

    .line 9
    .line 10
    iget-object p1, p0, LU8/j$d$a;->j:LU8/j$d;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LU8/j$d;->l(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
