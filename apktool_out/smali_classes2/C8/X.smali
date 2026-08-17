.class LC8/X;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LD8/g;

.field private final h:LC8/Y;


# direct methods
.method public constructor <init>(LD8/g;LC8/Y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC8/X;->g:LD8/g;

    .line 5
    .line 6
    iput-object p2, p0, LC8/X;->h:LC8/Y;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LC8/X;->g:LD8/g;

    .line 2
    .line 3
    iget-object v1, p0, LC8/X;->h:LC8/Y;

    .line 4
    .line 5
    invoke-static {v0, v1}, LC8/Y;->Q0(LD8/g;LC8/Y;)LC8/S;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
