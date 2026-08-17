.class LV7/b;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LX7/k;

.field private final h:LV7/c;


# direct methods
.method public constructor <init>(LX7/k;LV7/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV7/b;->g:LX7/k;

    .line 5
    .line 6
    iput-object p2, p0, LV7/b;->h:LV7/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LV7/b;->g:LX7/k;

    .line 2
    .line 3
    iget-object v1, p0, LV7/b;->h:LV7/c;

    .line 4
    .line 5
    invoke-static {v0, v1}, LV7/c;->b(LX7/k;LV7/c;)LC8/d0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
