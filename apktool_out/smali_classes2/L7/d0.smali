.class LL7/d0;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LL7/f0;


# direct methods
.method public constructor <init>(LL7/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL7/d0;->g:LL7/f0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/d0;->g:LL7/f0;

    .line 2
    .line 3
    invoke-static {v0}, LL7/f0;->a(LL7/f0;)Lv8/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
