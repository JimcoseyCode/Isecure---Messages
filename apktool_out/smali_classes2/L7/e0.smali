.class LL7/e0;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LL7/f0;

.field private final h:LD8/g;


# direct methods
.method public constructor <init>(LL7/f0;LD8/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL7/e0;->g:LL7/f0;

    .line 5
    .line 6
    iput-object p2, p0, LL7/e0;->h:LD8/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/e0;->g:LL7/f0;

    .line 2
    .line 3
    iget-object v1, p0, LL7/e0;->h:LD8/g;

    .line 4
    .line 5
    invoke-static {v0, v1}, LL7/f0;->b(LL7/f0;LD8/g;)Lv8/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
