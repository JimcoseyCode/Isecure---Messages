.class LF7/T0;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LF7/U0;

.field private final h:I

.field private final i:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LF7/U0;ILkotlin/Lazy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF7/T0;->g:LF7/U0;

    .line 5
    .line 6
    iput p2, p0, LF7/T0;->h:I

    .line 7
    .line 8
    iput-object p3, p0, LF7/T0;->i:Lkotlin/Lazy;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LF7/T0;->g:LF7/U0;

    .line 2
    .line 3
    iget v1, p0, LF7/T0;->h:I

    .line 4
    .line 5
    iget-object v2, p0, LF7/T0;->i:Lkotlin/Lazy;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LF7/U0;->j(LF7/U0;ILkotlin/Lazy;)Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
