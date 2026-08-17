.class LD8/j;
.super Ljava/lang/Object;

# interfaces
.implements Lw7/a;


# instance fields
.field private final g:LD8/n;


# direct methods
.method public constructor <init>(LD8/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD8/j;->g:LD8/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD8/j;->g:LD8/n;

    .line 2
    .line 3
    invoke-static {v0}, LD8/n;->c(LD8/n;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
