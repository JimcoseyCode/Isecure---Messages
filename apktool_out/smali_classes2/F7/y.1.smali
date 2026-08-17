.class LF7/y;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LL7/b;

.field private final h:I


# direct methods
.method public constructor <init>(LL7/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF7/y;->g:LL7/b;

    .line 5
    .line 6
    iput p2, p0, LF7/y;->h:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LF7/y;->g:LL7/b;

    .line 2
    .line 3
    iget v1, p0, LF7/y;->h:I

    .line 4
    .line 5
    invoke-static {v0, v1}, LF7/A;->K(LL7/b;I)LL7/W;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
